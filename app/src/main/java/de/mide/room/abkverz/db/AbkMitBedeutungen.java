package de.mide.room.abkverz.db;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;


/**
 * Klasse für Definition der 1:N-Beziehung zwischen Abkürzungen und Bedeutungen, siehe auch
 * <a href="https://developer.android.com/training/data-storage/room/relationships#one-to-many">hier</a>.
 * <br><br>
 *
 * Eine Abkürzung kann 1 oder mehr Bedeutungen haben.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class AbkMitBedeutungen {

    @Embedded public AbkEntity abk;

    @Relation(
            parentColumn = "abkid",
            entityColumn = "abkRefId"
    )

    public List<BedeutungEntity> bedeutungen;
}
