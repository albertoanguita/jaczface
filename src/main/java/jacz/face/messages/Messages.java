package jacz.face.messages;

import jacuzzi.util.network.IP4Port;

/**
 * Text messages to display in the GUI
 */
public final class Messages {

    public final static class ServerMessages {

        public static String CONNECTED_BUTTON() { return "Disconnect";}

        public static String DISCONNECTED_BUTTON() { return "Connect";}

        public static String CONNECTED() { return "Connected";}

        public static String DISCONNECTED() { return "Disconnected";}

        public static String NULL_ADDRESS() { return "-";}

        public static String ADDRESS(IP4Port ip4Port) { return ip4Port.toString();}


    }
}
