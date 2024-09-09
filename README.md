# AppComunityHelp-API

## Descripción del Proyecto

**AppComunityHelp-API** es un proyecto desarrollado en **Spring Boot** que sirve como la plataforma centralizada para una aplicación móvil orientada a la ayuda comunitaria y la seguridad. Este proyecto es parte de la presentación de un proyecto de título y se enfoca en proporcionar una **API REST** que gestiona la creación y participación en alertas y comunidades locales.

La API proporciona los siguientes servicios clave para la aplicación móvil:

- **Alertas SOS**: Los usuarios pueden generar alertas de emergencia (SOS) con geolocalización en tiempo real. Todos los usuarios dentro de un radio determinado recibirán la alerta y podrán ofrecer asistencia inmediata.
- **Comunidades**: Los usuarios pueden crear, unirse y participar en comunidades basadas en intereses o ubicaciones geográficas. Las comunidades pueden tener diferentes niveles de acceso:
  - **Acceso directo**: Los usuarios pueden unirse sin restricciones.
  - **Acceso mediante confirmación**: Un administrador debe aprobar las solicitudes de unión.
  - **Grupos cerrados**: El acceso es solo mediante invitación del administrador.

Este proyecto forma parte de una solución integral que conecta a las personas dentro de su comunidad y promueve la colaboración y la ayuda mutua en situaciones de emergencia.

## Tecnologías Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**

## Funcionalidades

### 1. Gestión de Alertas SOS
- Creación de alertas con información de **geolocalización**.
- Envío de alertas a los usuarios dentro de un radio específico.
- Visualización y respuesta a alertas por parte de los usuarios.

### 2. Gestión de Comunidades
- Creación de comunidades por parte de los usuarios.
- Configuración de accesos y permisos para las comunidades:
  - **Acceso directo**: Los usuarios pueden unirse sin restricciones.
  - **Confirmación por el administrador**: El administrador de la comunidad aprueba las solicitudes de unión.
  - **Grupo cerrado**: Solo se puede acceder mediante invitación.
- Participación en las comunidades a través de mensajes y eventos.
