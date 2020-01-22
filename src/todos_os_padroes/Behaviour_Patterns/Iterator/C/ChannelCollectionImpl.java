package todos_os_padroes.Behaviour_Patterns.Iterator.C;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelTypeEnum type;
        private List<Channel> channelsIteratorList;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum ty, List<Channel> channelsList) {
            this.type = ty;
            this.channelsIteratorList = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channelsIteratorList.size()) {
                Channel c = channelsIteratorList.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channelsIteratorList.get(position);
            position++;
            return c;
        }
    }
}
