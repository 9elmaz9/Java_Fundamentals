package Project2;

import java.util.Objects;

public class PostCard {
    String country;
    String continent;

    public PostCard(String country, String cintinent) {
        this.country = country;
        this.continent = cintinent;
    }

    @Override
    public String toString() {
        return "PostCard" +
                "country='" + country + '\'' +
                ", continent='" + continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCintinent() {
        return continent;
    }

    public void setCintinent(String cintinent) {
        this.continent = cintinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostCard postCard = (PostCard) o;
        return Objects.equals(country, postCard.country) && Objects.equals(continent, postCard.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, continent);
    }
}
