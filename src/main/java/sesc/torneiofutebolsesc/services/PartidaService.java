package sesc.torneiofutebolsesc.services;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import sesc.torneiofutebolsesc.entity.Partida;
import sesc.torneiofutebolsesc.repository.PartidaRepository;
@Service
public class PartidaService {

    @Resource
    private PartidaRepository partidaRepository;

    private Partida salvarPartida(Partida partida){

        Partida partidaSaved = partidaRepository.save(partida);

        return partidaSaved;
    }
}
