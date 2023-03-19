package com.example.fast.projet.models.stamps;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Stamp {

    protected Date dateCreated;

    protected Date dateUpdated;

    protected Date dateDeleted;
}
