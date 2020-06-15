# Something to prod
In [Nothing to prod](../nothing-to-prod-documentation/explanations/server/scala-project-overview.md), you built your first "Hello, World" service and deployed it. 
In this part of your training you will build your first fully functional Wix Service!
You will learn our best practices (like TDD), Wix architecture guidelines and how to use our basic building blocks.

## Prerequisites
Before beginning, you should have completed [Nothing to prod](../nothing-to-prod-documentation/explanations/server/scala-project-overview.md).   
This means you should have a working environment with Bazel and you can deploy to production. 
You should also have a basic knowledge of Scala, including: for-comprehensions, implicit calls, futures.

## Your mission
One of the features that Wix offers to users creating a website, is adding a "**Contact Us**" form. This form is actually an application installed on the Wix site that can issue calls to a backend server.

We want you to build a CRUD (Create / Read / Update / Delete) service for managing the data of these Contact Us forms. It will expose and implement basic operations on a `ContactUs` entity which will be called _Contact Us Service_.<br>

_Contact Us Service_ will be a backend part of an application that can be installed on a Wix Site.

## Something to Production - the Steps

|Step|What you will do...|
|---|------------|
| [1. Create a Loom project](steps/1-create-loom-project.md) | Create a basic project with basic CRUD functions for ContactForm.| 
| [2. Get the code to production](steps/2-get-code-to-production.md) | Deploy your app.| 
| [3. Call your service in production](steps/3-call-your-service-prod.md) | Set up a site and issue a successful call to your service. |
| [4. Implement the endpoints](steps/4-implement-the-endpoints.md) | Expose an API for incrementing the contact us counter. | 
| [5. Secure authorization and authentication](steps/5-secure-authorization-and-authentication.md) | Handle Authorization and authentication using our platformized solution. | 
| [6. Connect to Meta Site](steps/6-connect-to-meta-site.md) | Connect to Meta Site service via RPC. | 
| [7. Connect to Greyhound And Petri](steps/7-connect-grey-petri.md) | Connect to our experiment system (Petri) and messaging solution (Greyhound). | 
| [8. Monitoring production](steps/8-monitoring-production.md) | Monitoring your service in production. | 
| [9. Expose metrics](steps/9-expose-custom-metrics.md) | Expose custom metrics and learn how to monitor them. | 
| [10. Add documentation](steps/10-add-documentation.md) | Expose the API. |
| [11. Clean up](steps/cleanup.md) | Clean up the project. | 

## Getting help
We would like you to face the challenges independently.... but we will also give you hints along the way, in case you're stuck.  
As with Nothing-to-prod, we recommend that you do not look at other people's solutions, since it can confuse you and make you waste time on the wrong solutions.
If you need more help, you can:
* Look at the [Example Solution](solution-something-to-prod).
* Ask your buddy/TL/Team
* Use these Slack channels:
    * [#server-guild-4dummies](https://wix.slack.com/messages/C40MGKWV6) - When you don't know where to ask.
    * [#fw-team-support](https://wix.slack.com/messages/C0FQMK1FG) - Getting help from framework team.
    * [#Greyhound](https://wix.slack.com/archives/C0ZUG5VAS) - For Greyhound specific questions.
    * [#petri-discussions](https://wix.slack.com/archives/C0W6260BW) - For Petri specific questions.
    * [#api-gateway](https://wix.slack.com/archives/C8SRX40AW) - For API Gateway specific questions.
___________
> NOTE: Before you ask a question  on Slack, make sure you have updated your profile with your full name, actual picture and team (We are a big company and nobody knows who *john42* is.)
___________           

## Technologies you will learn ##
These are the main technologies we use at Wix. You don't need to learn *EVERYTHING* now - you will learn as you go.
Use this list for future reference:
* Loom - Our default framework, Before Loom we used the [framework](https://github.com/wix-platform/wix-framework) with [Bootstrap](https://github.com/wix-platform/wix-framework/tree/master/bootstrap-modules)  
  [Loom 101 Video](https://www.youtube.com/watch?v=Glf1nLQQIVM&t=3m46s)  
  [Loom Documentation](https://github.com/wix-private/server-infra/tree/master/framework/loom)
* [GRPC](https://github.com/wix-private/server-infra/tree/master/framework/grpc) - Communication between services
* [Protobuf IDL](https://bo.wix.com/wix-docs/rnd/platformization-guidelines#protobuf.protobuf-101) - Guidelines for creating API's
* [Greyhound](https://github.com/wix-private/server-infra/tree/master/iptf/greyhound) - Internal Library for using Kafka
* [Petri](https://github.com/wix-private/server-infra/tree/master/iptf/wix-petri) - Internal experiment system
* [RPC](https://github.com/wix-private/server-infra/blob/master/framework/examples/rpc-options/README.md) -  Communication between services

## Ready to go??
Let's start with [Step 1 - Create a loom project](steps/1-create-loom-project.md)
