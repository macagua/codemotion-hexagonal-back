# codemotion-hexagonal-backend

The Hexagonal Application Backend repo for the "EY Hexagonal Architecture"
workshop in the Codemotion Meet Madrid on 01/16/2025.

<a href="https://community.codemotion.com/codemotion-espana/meetups/codemeet-workshop-diseo-hexagonal-para-una-integracin-gil-entre-backend-y-frontend" title="CodeMeet Workshop: Diseño Hexagonal para una Integración Ágil entre Backend y Frontend">
  <img src="docs/images/event-cover.png" alt="The Hexagonal Architecture" width="400" height="256" />
</a>

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

This repository contains at least two APIs, which I describe below:

### Rick And Morty Character API

``/character``
- Obtains all Rick and Morty characters.

``/character/{id}``
- Gets the information of a Rick and Morty character.

### Pokemon API

``/api/pokemons``
- Obtains all Pokemon records

``/api/pokemon/{id}``
- Obtains the information of a Pokemon

## Testing

To testing the Pokemon API, with the following commands:

### All Pokemon records

```
curl -X GET http://localhost:8081/api/pokemons
```

### Information about a Pokemon

```
curl -X GET http://localhost:8081/api/pokemon/cel25-7
```
