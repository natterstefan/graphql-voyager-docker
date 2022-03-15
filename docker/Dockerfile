ARG node_version=16.14
ARG node_image=node:${node_version}-alpine

FROM $node_image
LABEL "maintainer"="Stefan Natter"
LABEL "github-url"="https://github.com/natterstefan/graphql-voyager-docker"

COPY . /src
WORKDIR /src

RUN yarn install --frozen-lockfile --production=true --no-progress --ignore-optional

EXPOSE 3000

CMD [ "node", "." ]
