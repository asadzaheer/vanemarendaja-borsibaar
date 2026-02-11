package com.borsibaar.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.UUID;

public record BarStationRequestDto(
    @NotBlank(message = "Bar station name is required")
    @Size(max = 120, message = "Name cannot exceed 120 characters")
    String name,
    @Size(max = 500, message = "Description cannot exceed 500 characters")
    String description,
    @NotNull(message = "Active status is required")
    Boolean isActive,
    @NotNull(message = "User IDs list cannot be null")
    List<UUID> userIds
) {
}
