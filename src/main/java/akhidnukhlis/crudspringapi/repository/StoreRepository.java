package akhidnukhlis.crudspringapi.repository;

import akhidnukhlis.crudspringapi.entity.Store;
import akhidnukhlis.crudspringapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store, String>, JpaSpecificationExecutor<Store> {

    Optional<Store> findFirstById(String id);
}
