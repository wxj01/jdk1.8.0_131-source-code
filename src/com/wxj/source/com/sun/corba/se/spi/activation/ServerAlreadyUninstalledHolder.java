package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerAlreadyUninstalledHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u131/8869/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, March 15, 2017 1:25:04 AM PDT
*/

public final class ServerAlreadyUninstalledHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerAlreadyUninstalled value = null;

  public ServerAlreadyUninstalledHolder ()
  {
  }

  public ServerAlreadyUninstalledHolder (ServerAlreadyUninstalled initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerAlreadyUninstalledHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerAlreadyUninstalledHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerAlreadyUninstalledHelper.type ();
  }

}
