Archive Client Library
======================

Java client library for the prototype REST API exposed by Archive of our Own.

Expected environment variables
------------------------------

| ARCHIVE_API_URL   | the URL to the base API end point |
| ARCHIVE_API_TOKEN | the access token allocated to your client application |

Usage
-----

* Build the jar, include it in your project.
* Set the above environment variables.
* Create a new instance of ArchiveClient.
* To retrieve a filtered list of works, create a new WorkSearch object with the desired criteria, and 
pass that to ArchiveClient#getWorks. This will return an array of Work objects.
