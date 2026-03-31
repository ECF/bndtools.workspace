# Bndtools ECF Remote Services Workspace Template

This repo contains a Bndtools Workspace Template. In Bndtools 7.1+, when a Bnd workspace is created a workspace template can be used in order to support a specific kind of development.  This workspace template has project templates for OSGi Remote Services development, and Model Context Protocol Server and Client Development.

To use this template, when creating a new Bnd Workspace (File->New->Other...->Bndtools->Bnd OSGi Workspace), select the ECF Bndtools Workspace template

<img width="575" height="455" alt="toolgroups api" src="https://github.com/user-attachments/assets/95ec5792-6bc2-4c88-990d-4e8d3350627e" />

## NEW (3/31/2026): Project Templates for MCP ToolGroups API, MCP Servers, and MCP Clients

Three project templates have been added to this workspace template:

MCP ToolGroups Example API Project - Declares an OSGi service interface with tools and toolgroups annotations

MCP ToolGroups Example Servers Project - Implements the API as an OSGi service, and dynamically adds tools from the service to an MCP Server

MCP ToolGroups Example Client Project = Implements a simple client that connects to running MCP Server and makes tool calls

To create and run these projects in your bnd workspace and launch the example MCP servers and client:

Create a ToolGroups API project using the MCP ToolGroups Example API project template

Menu:  File->New->Bnd OSGi Project...

<img width="575" height="455" alt="toolgroups api" src="https://github.com/user-attachments/assets/83d7cb4c-7478-413f-ac4d-dbb000f1e64f" />

Create a ToolGroups Server project using the MCP ToolGroups Example Servers project template

Menu:  File->New->Bnd OSGi Project...

<img width="575" height="455" alt="toolgroups server" src="https://github.com/user-attachments/assets/20ccecab-4950-4e9e-abf3-c2090cecb305" />

Create an ToolGroups Client project using the MCP ToolGroups Example Client project template

Menu:  File->New->Bnd OSGi Project...

<img width="575" height="455" alt="toolgroups client" src="https://github.com/user-attachments/assets/31d9d05c-2054-440b-9ee7-3a301f56f378" />

This will leave you with three complete projects in your Bndtools workspace

<img width="245" height="352" alt="toolgroups wkspace" src="https://github.com/user-attachments/assets/361ad561-d89f-4db3-8205-0b24fa52d5d7" />

See the Readme.md in the server project to launch the servers, and after launching the server, see Readme.md in the client project to start and connect the client.

## NEW (4/28/2025) Bndtools Template for Python.Java Remote Services Development

There has been a new project template added to the [ECF Bndtools Workspace Template](https://github.com/ECF/bndtools.workspace) that uses the [ECF Python.Java Distribution Provider](https://github.com/ECF/Py4j-RemoteServicesProvider).  This distribution provider is based upon py4j, which supports high performance remote procedure call between python and java processes.

To try it out after installing Bndtools 7.1 and the ECF tools add ons

1. Create a new Bnd OSGi project

![bndtoolsnewproject](https://github.com/user-attachments/assets/fa2641e6-a074-4796-b761-f79999b9ba06)

2. Open the projectName.hellopython.javahost.bndrun file in the project directory
   
![bndtoolsbndrun](https://github.com/user-attachments/assets/9bf8a380-9ee7-4e48-ac49-1627cf3ace75)

Choose 'Resolve' and then 'Update'

3. Select Debug OSGi to start the example application (Java)

![bndtoolsdebug](https://github.com/user-attachments/assets/9fa2536f-9748-4f5f-94bc-b78374f436a8)

Running Python Example Program 

1. Install [iPOPO v 3.1.0](https://ipopo.readthedocs.io) in your Python (3.9 or greater) local environment

2. In a command shell or IDE, navigate to the project directory and run the run_python_example.py script

```
python run_python_example.py
```
The examples will output progress to their respective consoles as the remote services are made exported,
discovered, and imported by the java process or the python process.  

![bndtoolspython](https://github.com/user-attachments/assets/d5bbd4e4-d57c-412a-a198-fe16ed76a95d)

Most of the code that produces output is available in the example project. For java: src/main/java/.../hello/*.java 
and python: python-src/samples/rsa

GRPC Development via Bndtools

This is a video tutorial showing how to use this workspace for gRPC development.  In 4 parts: [Part 1 - API Generation](https://www.youtube.com/watch?v=289BGznS_so), [Part 2 - Remote Service Implementation](https://www.youtube.com/watch?v=58ZU_KIKUAo), [Part 3 - Remote Service Consumer](https://www.youtube.com/watch?v=c4tMPbDPiVw), [Part 4 - Remote Service Debugging](https://www.youtube.com/watch?v=9Q2qfiL8QMA)

