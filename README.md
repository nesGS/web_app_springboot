# Néstor González Suárez

# 📚 Proyecto de Gestión de Alumnos y Proyectos

Este proyecto es una aplicación de gestión que permite administrar tanto un registro de alumnos como una lista de proyectos asociados. La aplicación incluye una interfaz web desarrollada con Spring MVC para la gestión y visualización, así como una API REST que expone los datos de alumnos y proyectos para su consumo por aplicaciones externas.

## Funcionalidades Principales

- **Gestión de Alumnos**: 
  - Agregar, editar, eliminar y visualizar alumnos.
  - Almacenar información como nombre, apellido, teléfono, email, DNI y fecha de nacimiento.
- **Gestión de Proyectos**:
  - Visualizar y administrar los proyectos asignados, con detalles de nombre, descripción y fechas de inicio y fin.
- **API REST**:
  - Exponer los datos de alumnos y proyectos a través de una API REST para integraciones externas.
  - Permitir operaciones CRUD sobre alumnos y proyectos.

## Endpoints de la Aplicación

### Controlador de Alumnos (`AlumnosController`)

Este controlador maneja la interfaz web para la gestión de alumnos y proyectos.

- `GET /alumnos` o `/`: Muestra la lista de todos los alumnos.
- `GET /alumnos/new`: Muestra el formulario para agregar un nuevo alumno.
- `POST /alumnos/new`: Procesa el formulario para guardar un nuevo alumno.
- `GET /alumnos/edit/{id}`: Muestra el formulario para editar la información de un alumno específico.
- `POST /alumnos/edit/{id}`: Procesa la edición y guarda los cambios.
- `GET /alumnos/delete/{id}`: Elimina el alumno correspondiente al ID proporcionado.
- `GET /proyectos`: Muestra una lista de todos los proyectos.

### Controlador de API (`ApiController`)

Este controlador expone la API REST para las operaciones CRUD sobre alumnos y proyectos.

#### Endpoints de Alumnos

- `GET /api/alumnos`: Devuelve una lista de todos los alumnos.
- `GET /api/alumnos/{id}`: Devuelve la información de un alumno específico por su ID.
- `POST /api/alumnos`: Crea un nuevo registro de alumno.
- `PUT /api/alumnos/{id}`: Actualiza la información de un alumno específico.
- `DELETE /api/alumnos/{id}`: Elimina un alumno específico por su ID.

#### Endpoints de Proyectos

- `GET /api/proyectos`: Devuelve una lista de todos los proyectos.
- `GET /api/proyectos/{id}`: Devuelve la información de un proyecto específico por su ID.
- `POST /api/proyectos`: Crea un nuevo registro de proyecto.
- `PUT /api/proyectos/{id}`: Actualiza la información de un proyecto específico.
- `DELETE /api/proyectos/{id}`: Elimina un proyecto específico por su ID.

## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación principal.
- **Spring Boot**: Framework para simplificar el desarrollo de aplicaciones Java.
- **Spring MVC**: Para manejar las peticiones y las respuestas de la interfaz web.
- **API REST**: Para exponer la funcionalidad de gestión de alumnos y proyectos.
- **Thymeleaf**: Motor de plantillas para las vistas del lado del servidor.
- **Maven**: Para la gestión de dependencias y construcción del proyecto.

## Cómo Ejecutar el Proyecto

1. Clona este repositorio.
2. Asegúrate de tener **Java 17** y **Maven** instalados.
3. Ejecuta el comando `mvn spring-boot:run` en la raíz del proyecto.
4. Accede a la aplicación en [http://localhost:8080](http://localhost:8080) para utilizar la interfaz web.

## Estructura de la Base de Datos

La base de datos está estructurada para almacenar:
- **Alumnos**: Datos como nombre, apellido, teléfono, email, DNI y fecha de nacimiento.
- **Proyectos**: Información relevante de los proyectos, incluyendo nombre, descripción, fecha de inicio y fin, y estado (activo/inactivo).

---

Este proyecto es una excelente base para sistemas de gestión escolar o empresarial que requieran almacenar y visualizar datos de alumnos y proyectos. ¡Explóralo y personalízalo para tus necesidades! 📊
