package academy.devdojo.springboot2.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;


    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
    }

    // Without getters and Setters Jackson dependency can't serialize the classes


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

