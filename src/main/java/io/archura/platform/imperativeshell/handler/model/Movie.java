package io.archura.platform.imperativeshell.handler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {
    private String title;
    private int year;
}
