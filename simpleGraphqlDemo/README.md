# Mini Book-Catalogue GraphQL API Project using Java Spring Framework

---

This is a mini basic book-catalogue GraphQL API, developed using the Java Spring Framework.

## Running the API

- To get the API up and running, just move to the root directory of the project `simpleGraphqlDemo` using your terminal,
- Then execute the command: `./gradlew bootRun` to start the SpringBoot application.

For some reason the execution might not exceed 80% but, after that, your GraphQL API should be operational and ready for use on URL http://localhost:8080/graphiql.

---

## GraphQL API Query Examples

Below are an example of queries that you can execute in the GraphQL API:

- **Query a bookDetails by its ID**:
  ```graphql
  query bookDetails {
    bookById(id: "book-1") {
      id
      name
      pageCount
      author {
        id
        firstName
        lastName
      }
    }
  }
  ```

---

Feel free to adjust any section according to your specific project requirements or personal preferences.
