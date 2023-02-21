package com.example.HackerNewsAPI.Repository;

import com.example.HackerNewsAPI.Model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items,Long> {
}
