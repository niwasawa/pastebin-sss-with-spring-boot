package info.maigo.lab.pastebin.application;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import info.maigo.lab.pastebin.domain.NotIncludedIllegalCharacters;

public class PostForm implements Serializable {

    @NotEmpty
    @Size(min = 1, max = 256)
    @NotIncludedIllegalCharacters
    private String title;

    @NotEmpty
    @NotIncludedIllegalCharacters
    private String body;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
