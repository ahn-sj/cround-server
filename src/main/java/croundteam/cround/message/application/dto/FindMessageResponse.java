package croundteam.cround.message.application.dto;

import croundteam.cround.message.domain.Message;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class FindMessageResponse {

    private Long id;
    private Long sender;
    private Long receiver;
    private String text;
    private String updatedDate;
    private String nickname;

    public FindMessageResponse(Message message) {
        this.id = message.getId();
        this.sender = message.getSender().getId();
        this.receiver = message.getReceiver().getId();
        this.text = message.getText();
        this.updatedDate = message.getFormatUpdatedDate();
        this.nickname = message.getReceiverName();
    }
}
