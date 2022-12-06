package ru.gur.archbrokerageaccount.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gur.archbrokerageaccount.entity.BrokerageAccount;

import java.util.UUID;

@Repository
public interface BorkerageAccountRepository extends JpaRepository<BrokerageAccount, UUID> {
}
