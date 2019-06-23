# Graphql-Voyager-Docker

Simple docker image for [GraphQL voyager](https://github.com/APIs-guru/graphql-voyager).

## Usage

Create or extend your `docker-compose.yml` configuration and start the app later
with: `docker-compose up`.

```yml
version: "3.5"

services:
  app:
    image: graphql-voyager
    ports:
      - "3000:3000"
    environment:
      # example url, must point to your graphql server/api
      GRAPHQL_URL: http://localhost:8000
```

## How to build the docker image

I use the [lovely-gradle-plugin created by Lovely Systems](https://github.com/lovelysystems/lovely-gradle-plugin)
to build and publish the docker image. It is simple and works like this:

```bash
# this will create a tag and push it to github
git tag <new-git-tag>
git push --tags
# creates a docker image and tags it with both `dev` and the latest tag
./gradlew buildDockerImage
# publishes the docker image to docker hub
./gradlew pushDockerImage
```

## LICENSE

[APACHE 2.0](./LICENCE)

## Contributors ✨

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore -->
<table>
  <tr>
    <td align="center"><a href="http://twitter.com/natterstefan"><img src="https://avatars2.githubusercontent.com/u/1043668?v=4" width="100px;" alt="Stefan Natter"/><br /><sub><b>Stefan Natter</b></sub></a><br /><a href="#ideas-natterstefan" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/natterstefan/graphql-voyager-docker/commits?author=natterstefan" title="Documentation">📖</a> <a href="https://github.com/natterstefan/graphql-voyager-docker/commits?author=natterstefan" title="Code">💻</a></td>
  </tr>
</table>

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
