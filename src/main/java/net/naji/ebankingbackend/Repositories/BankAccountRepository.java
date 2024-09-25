package net.naji.ebankingbackend.Repositories;

import net.naji.ebankingbackend.Entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
