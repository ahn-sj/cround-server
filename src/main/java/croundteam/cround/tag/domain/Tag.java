package croundteam.cround.tag.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private TagName tagName;

    public Tag(String tagName) {
        this(TagName.from(tagName));
    }

    public Tag(TagName tagName) {
        this.tagName = tagName;
    }
}