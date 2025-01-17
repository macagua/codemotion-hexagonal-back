# codemotion-hexagonal-backend

## Pre requirements

- ``curl`` command or [Postman](https://www.postman.com/) software.
- [Docker Engine](https://docs.docker.com/engine/install/) or [Docker Desktop](https://docs.docker.com/desktop/).
- [Java™ Development Kit (JDK)](https://vegastack.com/tutorials/how-to-install-openjdk-17-on-debian-12/) version 17 or later.
- [Apache Maven](https://maven.apache.org/) version 3.8.7 or later.

## Download

```
git clone github.com:macagua/codemotion-hexagonal-backend.git
cd codemotion-hexagonal-backend
```

## Build

Use Apache Maven for to build the ``jar`` package, with the following commands:

```
mvn package
```

## Deploy

Use Docker to deploy the ``backend`` application container, with the following commands:

```
docker-compose up -d
```

## APIs

### Rick And Morty Character API

``/character``
- Obtiene todos los personajes de Rick y Morty

``/character/{id}``
- Obtiene la información especifica de un personaje de Rick y Morty

### Pokemon API

``/apt/pokemons``
- Obtiene todos los registros de Pokemons

``/apt/pokemon/{id}``
- Obtiene la información de un Pokemon

## Testing

To testing the Pokemon API, with the following commands:

### Todos los registros de Pokemons

```
curl http://localhost:8081/api/pokemons
```

### Información de un Pokemon

```
curl http://localhost:8081/api/pokemon/cel25-7
```
