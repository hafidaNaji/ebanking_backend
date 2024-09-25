package net.naji.ebankingbackend.Repositories;

import net.naji.ebankingbackend.Entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
