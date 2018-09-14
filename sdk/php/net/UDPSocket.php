<?php
namespace php\net;

use php\io\IOException;

class UDPSocket{
    /**
     * @param int $port
     * @param string $host
     * @throws IOException
     */
    public function __construct($port = null, $host = null){

    }
    /**
     * @param string $host
     * @param int $port
     */
    public function connect($host, $port){

    }
    public function close(){

    }
    /**
     * @return bool
     */
    public function isConnected(){

    }
    /**
     * @return bool
     */
    public function isClosed(){

    }
    /**
     * @param string $host
     * @param int $port
     * @throws IOException
     */
    public function bind($host, $port){

    }
    /**
     * @param UDPSocketPacket $packet
     * @throws IOException
     */
    public function send($packet){

    }
    public function disconnect(){

    }
    /**
     * @return string
     */
    public function getLocalAddress(){

    }
    /**
     * @return int
     */
    public function getLocalPort(){

    }
    /**
     * @param int $value
     * @throws IOException
     */
    public function setSoTimeout($value){

    }
    /**
     * @param bool $value
     * @throws IOException
     */
    public function setReuseAddress($value){

    }
    /**
     * @param int $value
     * @throws IOException
     */
    public function setReceiveBufferSize($value){

    }
    /**
     * @param int $value
     * @throws IOException
     */
    public function setSendBufferSize($value){

    }
    /**
     * @param int $value
     * @throws IOException
     */
    public function setTrafficClass($value){

    }
    /**
     * @return string
     */
    public function getInetAddress(){

    }
    /**
     * @return bool
     */
    public function isBound(){

    }
    /**
     * @return bool
     * @throws IOException
     */
    public function getBroadcast(){

    }
    /**
     * @param UDPSocketPacket $packet
     * @throws IOException
     */
    public function receive($packet){

    }
    /**
     * @return bool
     * @throws IOException
     */
    public function getReuseAddress(){

    }
    /**
     * @return int
     * @throws IOException
     */
    public function getSoTimeout(){

    }
    /**
     * @return int
     * @throws IOException
     */
    public function getTrafficClass(){

    }
    /**
     * @param bool $value
     * @throws IOException
     */
    public function setBroadcast($value){

    }
    /**
     * @return string
     */
    public function getRemoteSocketAddress(){

    }
    /**
     * @return int
     * @throws IOException
     */
    public function getReceiveBufferSize(){

    }
    /**
     * @return int
     * @throws IOException
     */
    public function getSendBufferSize(){

    }
}