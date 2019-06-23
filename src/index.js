// docs: https://github.com/APIs-guru/graphql-voyager
const server = require('express');
const { express: voyagerMiddleware} = require('graphql-voyager/middleware');
const dotenv = require('dotenv');

const app = server();
const port = 3000;

if (!process.env.GRAPHQL_URL) {
  throw new Error('GRAPHQL_URL is not defined!')
}

app.use('/', voyagerMiddleware({ endpointUrl: process.env.GRAPHQL_URL }));

app.listen(port, () => console.log(`voyager listening: http://localhost:${port}`));
