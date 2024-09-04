package com.rocketseat.planner.activity;

import com.rocketseat.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repository;

    public ActivityResponse registerActivity (ActivityRequestPayload payload, Trip trip) {
        Activity newActivity = new Activity(payload.title(), payload.occurs_at(), trip);

        this.repository.save(newActivity);

        return new ActivityResponse(newActivity.getId());

    }

    public List<ActivityData> getAllActivitiesFromId(UUID tripId) {
        return this.repository.findByTripId(tripId)
                .stream()  // Cria um fluxo a partir da lista de participantes
                .map(activity -> new ActivityData(activity.getId(), activity.getTitle(), activity.getOccursAt()))  // Mapeia cada participante para um ParticipantData
                .collect(Collectors.toList());  // Coleta os resultados em uma lista
    }
}
