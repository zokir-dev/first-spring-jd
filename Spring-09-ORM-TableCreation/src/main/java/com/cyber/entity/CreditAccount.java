package com.cyber.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.function.BiConsumer;

@Entity
public class CreditAccount extends Account{

     BigDecimal creditLimit;
}
