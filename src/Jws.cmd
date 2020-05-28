rmdir /s /q .\com\jws
wsimport -keep http://172.16.100.51/Jws?wsdl
erase .\com\jws\*.class