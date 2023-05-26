package croundteam.cround.creator.domain.platform;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Platform {

    // TODO: 플랫폼 테마 추가

    @Embedded
    private PlatformUrl platformUrl;

    // TODO: 플랫폼 타입은 최소 1개 ~ 여러 개로 입력 가능하다.
    @Embedded
    private PlatformType platformType;

    @Embedded
    private PlatformActivityName platformActivityName;

    private Platform(PlatformUrl platformUrl, PlatformType platformType, PlatformActivityName platformActivityName) {
        this.platformUrl = platformUrl;
        this.platformType = platformType;
        this.platformActivityName = platformActivityName;
    }

    public static Platform of(String platformUrl, String platformType, String platformActivityName) {
        return new Platform(
                PlatformUrl.from(platformUrl),
                PlatformType.from(platformType),
                PlatformActivityName.from(platformActivityName)
        );
    }

    public String getPlatformUrl() {
        return platformUrl.getUrl();
    }

    public String getPlatformType() {
        return platformType.getPlatformName();
    }

    public String getPlatformActivityName() {
        return platformActivityName.getName();
    }
}
