# UDPSocket
Расширение для работы с сокетами по протоколу UDP
## Установка
```
jppm add jphp-udpsocket-ext
```
## Примеры
### Инициализировать сервер:
```php
use php\net\UDPSocket;

$server = new UDPSocket;
$server->bind($host, $port);
```
### Перехватить пакет:
```php
use php\net\UDPSocket;
use php\net\UDPSocketPacket;

$server = new UDPSocket;
$server->bind($host, $port);

$packet = new UDPSocketPacket(1024);
$server->receive($packet);
echo "Receive packet from: {$packet->getSocketAddress()}\n";
echo "Packet data: {$packet->getData()}\n";
```
### Отправить пакет:
```php
use php\net\UDPSocket;
use php\net\UDPSocketPacket;

$client = new UDPSocket;

// вариант 1
$client->connect($host, $port);
$packet = new UDPSocketPacket(10);
$packet->setData('hello, man');
$client->send($packet);

// вариант 2
$packet = new UDPSocketPacket(10, $host, $port);
$packet->setData('hello, man');
$client->send($packet);
```
## Расширение для DevelNext
[Скачать](https://github.com/jphp-group/jphp-udpsocket-ext/releases/latest)

## Дополнительно

[DevelNext - extensions & manuals.](https://vk.com/dn_extension)

[Venity](https://vk.com/venity)