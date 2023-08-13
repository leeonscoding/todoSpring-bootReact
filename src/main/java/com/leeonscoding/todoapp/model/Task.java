package com.leeonscoding.todoapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Task extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String title;
    private String description;

    @NotNull
    @OneToOne
    @JoinColumn(name = "owner_id")
    private AppUser createdBy;

    @NotNull
    @OneToOne
    @JoinColumn(name = "auditor_id")
    private AppUser lastModifiedBy;

    @Enumerated(value = EnumType.STRING)
    private TaskStatus status;

    @Enumerated(value = EnumType.STRING)
    private ImportanceLevel level;

    private ZonedDateTime startDateTime;
    private ZonedDateTime endDateTime;

    @ManyToOne
    @JoinColumn(name = "additional_owners_id", foreignKey = @ForeignKey(name = "fk_ad_user_id"))
    private AppUser additionalOwners;
}
