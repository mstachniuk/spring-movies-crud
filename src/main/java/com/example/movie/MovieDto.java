package com.example.movie;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class MovieDto {

    private Long id;
    private String title;
    private LocalDate releaseDate;
    private List<DirectorDto> directors;
    private Map<String, ActorDto> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<DirectorDto> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorDto> directors) {
        this.directors = directors;
    }

    public Map<String, ActorDto> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, ActorDto> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieDto)) return false;

        MovieDto movieDto = (MovieDto) o;

        if (id != null ? !id.equals(movieDto.id) : movieDto.id != null) return false;
        if (title != null ? !title.equals(movieDto.title) : movieDto.title != null) return false;
        if (releaseDate != null ? !releaseDate.equals(movieDto.releaseDate) : movieDto.releaseDate != null)
            return false;
        if (directors != null ? !directors.equals(movieDto.directors) : movieDto.directors != null) return false;
        return roles != null ? roles.equals(movieDto.roles) : movieDto.roles == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (directors != null ? directors.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MovieDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", directors=" + directors +
                ", roles=" + roles +
                '}';
    }
}
