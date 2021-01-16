package com.cyber.repository;

import com.cyber.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //
//Write a derived query to get cinema with a specific name
    Optional<Cinema> findAllByName(String name);

    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name
    List<Cinema> findTop3BySponsoredName(String sponsoredName);
    List<Cinema> findFirst3BySponsoredNameContainingOrderBySponsoredName(String name);

    //Write a derived query to list all cinemas in a specific country
    List<Cinema> findAllByLocationCountry(String location);

//Write a derived query to list all cinemas with a specific name or sponsored name
    List<Cinema> findAllByNameOrSponsoredName(String name, String sponsoreName);


// ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id
    @Query("select c.name from Cinema c where c.id=:id")
    String fetchAllCinemaById(@Param("id") Integer id);

// ------------------- Native QUERIES ------------------- //
//Write a native query to read all cinemas by location country
    @Query(value = "select * from cinema where lcoation_id =(" +
            "select id from location where country = ?1)", nativeQuery = true)
    List<Cinema> fetChAllByLication(String locationCountry);

    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern
    @Query(value = "select * from cinema where name ilike concat('%', ?1,'%') or" +
            " sponsored_name ilike concat('%', ?2,'%') ", nativeQuery = true)
    List<Cinema> fetchAllByNameOrSponsoredName(String name, String sponsoredName);

    //Write a native query to sort all cinemas by name
    @Query(value = "select * from cinema order by name desc", nativeQuery = true)
    List<Cinema> fetchALlSortedByName();

    //Write a native query to distinct all cinemas by sponsored name
    @Query(value = "select distinct * from cinema where sponsored_nmae = ?1", nativeQuery = true)
    List<Cinema>  fetchBySponsoredNameDistincted(String spName);
}
