# COR (Chain of Responsibility) Pattern

## Description:

The Chain of Responsibility (COR) pattern is a behavioral design pattern that allows an object to pass a request along a chain of potential handlers until one of them handles the request. This pattern decouples the sender of a request from its receivers, allowing multiple objects to handle the request without the sender needing to know which object will handle it.

## Example:
Goal: Implement a system that processes customer creation, sandbox initialization and authorization.

We have an external api which create customer for us. Return to us a response with customer's details, such as customer's name, email, address.

If response OK:

- With customer's endpoint response we should create a sandbox customer via another API (return and id, ip address if the call is OK).
- Save the sandbox id and status in a table named sandbox_customers.
- Authorize customer by inserting into a table named sandbox_customers_authorized_ip the customer id, ip address.
