FROM node:alpine
LABEL "maintainer"="Stefan Natter"
LABEL "github-url"="https://github.com/natterstefan/graphql-voyager-docker"

COPY . /src
WORKDIR /src

RUN npm install --production

EXPOSE 3000
CMD [ "node", "." ]
