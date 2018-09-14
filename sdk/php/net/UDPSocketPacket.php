<?php


namespace php\net;


class UDPSocketPacket{

    /**
     * UDPSocketPacket constructor.
     * @param int $length
     * @param string|null $host
     * @param int|null $port
     */
    public function __construct($length, $host = null, $port = null){

    }

    /**
     * @return int
     */
    public function getOffset(){

    }
    /**
     * @return int
     */
    public function getLength(){

    }
    /**
     * @return int
     */
    public function getPort(){

    }

    /**
     * @return string
     */
    public function getAddress(){

    }
    /**
     * @return string
     */
    public function getSocketAddress(){

    }
    /**
     * @return string
     */
    public function getData(){

    }
    /**
     * @param string $data
     */
    public function setData(string $data){

    }
    /**
     * @param string $address
     */
    public function setSocketAddress(string $address){

    }
}