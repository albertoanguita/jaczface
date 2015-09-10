package jacz.face.actions;

import jacuzzi.comm_engine.comm_level.CommError;
import jacuzzi.jpeerengineclient.DownloadManager;
import jacuzzi.jpeerengineclient.JacuzziPeerClientAction;
import jacuzzi.jpeerengineclient.ResourceRequestResult;
import jacuzzi.util.network.IP4Port;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import peerengine.PeerID;
import peerengine.client.PeerServerData;
import peerengine.client.connection.ClientConnectionFSM;
import peerengine.util.ConnectionStatus;
import peerengine.util.data_synchronization.ListAccessor;
import peerengine.util.data_synchronization.premade_lists.SimplePersonalData;

import java.util.List;
import java.util.Map;

/**
 * Implementation of the JacuzziPeerClientAction interface for the GUI
 */
public class ClientActionImpl implements JacuzziPeerClientAction {

    private StringProperty ownID;

    private ConnectionToServerStatus connectionToServerStatus;

    public ClientActionImpl(ConnectionToServerStatus connectionToServerStatus) {
        ownID = new SimpleStringProperty();
        this.connectionToServerStatus = connectionToServerStatus;
    }



    @Override
    public void newPeerConnected(PeerID peerID, ConnectionStatus status) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, ListAccessor> getTransmittingListsForNewPeer(PeerID peerID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, ListAccessor> getReceivingListsForNewPeer(PeerID peerID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void newObjectMessage(PeerID peerID, Object message) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void newChatMessage(PeerID peerID, String message) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void peerValidatedUs(PeerID peerID) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void peerDisconnected(PeerID peerID, CommError error) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void connectionToServerEstablished(PeerServerData peerServerData) {
        connectionToServerStatus.connectionEstablished(peerServerData);
    }

    @Override
    public void unableToConnectToServer(PeerServerData peerServerData) {
        connectionToServerStatus.unableToConnect(peerServerData);
    }

    @Override
    public void serverTookToMuchTimeToAnswerConnectionRequest(PeerServerData peerServerData) {
        connectionToServerStatus.tookToMuchTimeToAnswerConnectionRequest(peerServerData);
    }

    @Override
    public void connectionToServerDenied(PeerServerData peerServerData, ClientConnectionFSM.ConnectionFailureReason reason) {
        connectionToServerStatus.connectionDenied(peerServerData, reason);
    }

    @Override
    public void connectionToServerTimedOut(PeerServerData peerServerData) {
        connectionToServerStatus.connectionTimedOut(peerServerData);
    }

    @Override
    public void disconnectedFromServer(boolean expected, PeerServerData peerServerData) {
        connectionToServerStatus.disconnected(expected, peerServerData);
    }

    @Override
    public void undefinedOwnInetAddress() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void peerCouldNotConnectToUs(Exception e, IP4Port ip4Port) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void peerConnectionsListenerError(Exception e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void periodicDownloadsNotification(List<DownloadManager> visibleDownloads) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ResourceRequestResult requestResourceDefaultStore(PeerID peerID, String resourceID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ResourceRequestResult requestResource(PeerID peerID, String resourceID, String resourceStore) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void newPeerNick(PeerID peerID, String nick) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void newPeerState(PeerID peerID, SimplePersonalData.State state) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void newPeerMessage(PeerID peerID, String message) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
