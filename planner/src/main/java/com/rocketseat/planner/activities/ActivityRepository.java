package com.rocketseat.planner.activities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;
import java.util.UUID;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {
}
