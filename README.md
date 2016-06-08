# StorageServices

The Storage Service is a RestFul Web Service. This layer gets and switches the requests to [LocalDatabase Services](https://github.com/introSDE-FinalProject-2016/LocalDatabaseServices) (comunicates with database) or [Adapter Services](https://github.com/introSDE-FinalProject-2016/AdapterServices) (comunicates with the external API) modules. Finally, sends the responses to the next layer in the application.


[API Documentation](http://docs.storageservices.apiary.io/#)  
[URL Client](https://github.com/introSDE-FinalProject-2016/Telegram-Bot)  
[URL Server (heroku)](https://warm-hamlet-95336.herokuapp.com/sdelab/storage-service) 


###Install
In order to execute this server locally you need the following technologies:

* Java (jdk 1.8.0)
* Ant (version 1.9.6)

Then, clone the repository. Run in your terminal:

```
$ git clone like https://github.com/introSDE-FinalProject-2016/StorageServices.git && cd StorageServices
```

and run the following command:
```
ant install
```

###Getting Started
To run the server locally then run:
```
ant start
```