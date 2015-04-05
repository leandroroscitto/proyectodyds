# Modelo Relacional de datos #

## Entidades ##
  * Evento ( **ID**, Nombre, Organizador, FIni, FFin )
  * Actividad ( **ID**, Nombre, TipoAct, ... )
  * Persona ( **DNI**, Nombre, Apellido, E-mail )
  * Auspiciante ( **ID**, Nombre, Teléfono )
  * CaracterPart (**ID**, Nombre )

## Relaciones ##
  * Auspicio ( **Evento.ID**, **Auspiciante.ID**, **Tipo**, Arancel )
  * RespEvento( **ID**, Evento.ID, Persona.DNI )
  * RespActividad( **ID**, Actividad.ID, Persona.DNI )
  * ACargoAct ( **Actividad.ID**, Persona.DNI )
  * DetalleCP ( **CaracterPart.ID**, **Actividad.ID**, AMin, Monto, Eval, Cert)