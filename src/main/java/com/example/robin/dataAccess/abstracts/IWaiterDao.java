package com.example.robin.dataAccess.abstracts;

import com.example.robin.entities.concretes.Waiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWaiterDao extends JpaRepository<Waiter,Integer> {
    Waiter getByUserNameAndPassword(String userName, String password);
}
