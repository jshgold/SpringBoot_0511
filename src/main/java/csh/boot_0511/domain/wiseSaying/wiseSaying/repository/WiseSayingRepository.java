package csh.boot_0511.domain.wiseSaying.wiseSaying.repository;

import csh.boot_0511.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface WiseSayingRepository extends JpaRepository<WiseSaying, Integer> {
}