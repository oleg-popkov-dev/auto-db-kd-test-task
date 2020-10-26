package kz.kazdream.service.rabbit;

import kz.kazdream.model.dto.AutoDTO;
import kz.kazdream.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoRabbitMsgReceiver {

    @Autowired
    private AutoService autoService;

    public void receiveAndSaveMessage(AutoDTO autoDTO) {
        AutoDTO resultDto = autoService.saveAuto(autoDTO);
        if (resultDto != null) {
            System.out.println("Message created");
        } else {
            System.out.println("Message is failed");
        }
    }

}
