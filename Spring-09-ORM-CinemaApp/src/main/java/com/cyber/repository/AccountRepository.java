package com.cyber.repository;

import com.cyber.entity.Account;
import com.cyber.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.accessibility.AccessibleAction;
import javax.management.relation.Role;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    // ------------------- DERIVED QUERIES ------------------- //
//Write a derived query to list all accounts with a specific country or state
    List<Account> findAllByCountryOrState(String county, String state);
//Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findAllByAgeLessThanEqual(Integer age);
//Write a derived query to list all accounts with a specific role
    List<Account> findAllByRole(UserRole role);
//Write a derived query to list all accounts between a range of ages
    List<Account> findAllByAgeBetween(Integer ageMIn, Integer ageMax);
//Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findAllByAddressStartingWith(String pathern);
//Write a derived query to sort the list of accounts with age
    List<Account> findAllByOrderByAgeDesc();
// ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
    @Query("SELECT a FROM Account a")
    List<Account> returnAllAccounts();
//Write a JPQL query to list all admin accounts
    @Query("select a from Account a where a.role='Admin'")
    List<Account> returnAllAdminAccounts();
//Write a JPQL query to sort all accounts with age
    @Query("select a from Account a order by a.age")
    List<Account> returnAllAccountsSortedByAge();
// ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "select * from account_details where age<?1", nativeQuery = true)
    List<Account> returnAllAccountLessThenAge(Integer age);
//Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    @Query(value = "select * from account_details where name ilike concat('%',?1, '%') or" +
            "address ilike concat('%',?1, '%') or " +
            "country ilike concat('%',?1, '%') or" +
            " state ilike concat('%',?1, '%') or" +
            " cityilike concat('%',?1, '%')"
            , nativeQuery = true)
    List<Account> returnAllCountaining(String pathern);
//Write a native query to read all accounts with an age lower than a specific value

    @Query(value = "select * from account_details where age < ?1", nativeQuery = true)
    List<Account> fetchByAgeLessThan(Integer age);
}
