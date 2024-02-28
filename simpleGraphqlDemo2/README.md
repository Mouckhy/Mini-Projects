# Mini Book-Catalogue GraphQL API Project using Java Spring Framework, PostgreSQL and Docker

---

This project is a mini book-catalogue GraphQL API, developed using the Java Spring Framework. It utilizes an external database accessed through PostgreSQL within a Docker container to manage and fetch data.

## Running the API

To get the API up and running, please follow these three steps carefully:

1. **Start Docker Engine**: Ensure the Docker engine is running on your local machine.

2. **Deploy Docker Container**: Navigate to the following directory and deploy the Docker container:
    - Path: `simpleGraphqlDemo2/src/main/resources`
    - Use the command: `docker-compose up` (make sure you are in the correct directory where the `docker-compose.yaml` file is located).

3. **Launch SpringBoot Application**:
    - Move to the root directory of the project `simpleGraphqlDemo2` using your terminal.
    - Execute the command: `./gradlew bootRun` to start the SpringBoot application.

For some reason the execution might not exceed 80% but, by following these steps, your GraphQL API should be operational and ready for use on URL http://localhost:8080/graphiql.

---
## GraphQL API Query Examples

Below are some examples of queries that you can execute in the GraphQL API:

- **Query to fetch all books**:
  ```graphql
  query allBooks {
    allBooks {
      id
      title
      genre
      author {
        id
        name
      }
      publisher {
        id
        name
      }
    }
  }
  ```
- **Query to fetch a book by its ID**:
    ```graphql
    query bookByID {
      bookById(id: "00000000-0000-0000-0000-000000000001") {
        id
        title
        genre
        page_count
        author {
          id
          name
        }
        publisher {
          id
          name
        }
      }
    }
  ```
- **Query to fetch all authors**:
    ```graphql
    query allAuthors {
      allAuthors {
        id
        name
        created_by
        updated_by
      }
    }
  ```
- **Query to fetch a book by its ID**:
    ```graphql
    query authorByID {
      authorById(id: "00000000-0000-0000-0000-000000000001") {
        id
        name
        updated_by
        created_by
      }
    }
    ```

---

Feel free to adjust any section according to your specific project requirements or personal preferences.


