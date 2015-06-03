/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_connection extends bandwidth_socket {
  private long swigCPtr;

  protected peer_connection(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.peer_connection_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_connection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_connection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.peer_connection_type(swigCPtr, this);
  }

  public void start() {
    libtorrent_jni.peer_connection_start(swigCPtr, this);
  }

  public void set_peer_info(torrent_peer pi) {
    libtorrent_jni.peer_connection_set_peer_info(swigCPtr, this, torrent_peer.getCPtr(pi), pi);
  }

  public void peer_exceeds_limit() {
    libtorrent_jni.peer_connection_peer_exceeds_limit(swigCPtr, this);
  }

  public void peer_disconnected_other() {
    libtorrent_jni.peer_connection_peer_disconnected_other(swigCPtr, this);
  }

  public void send_allowed_set() {
    libtorrent_jni.peer_connection_send_allowed_set(swigCPtr, this);
  }

  public void init() {
    libtorrent_jni.peer_connection_init(swigCPtr, this);
  }

  public void on_metadata() {
    libtorrent_jni.peer_connection_on_metadata(swigCPtr, this);
  }

  public void on_metadata_impl() {
    libtorrent_jni.peer_connection_on_metadata_impl(swigCPtr, this);
  }

  public void picker_options(int o) {
    libtorrent_jni.peer_connection_picker_options__SWIG_0(swigCPtr, this, o);
  }

  public int prefer_contiguous_blocks() {
    return libtorrent_jni.peer_connection_prefer_contiguous_blocks__SWIG_0(swigCPtr, this);
  }

  public boolean on_parole() {
    return libtorrent_jni.peer_connection_on_parole(swigCPtr, this);
  }

  public int picker_options() {
    return libtorrent_jni.peer_connection_picker_options__SWIG_1(swigCPtr, this);
  }

  public void prefer_contiguous_blocks(int num) {
    libtorrent_jni.peer_connection_prefer_contiguous_blocks__SWIG_1(swigCPtr, this, num);
  }

  public boolean request_large_blocks() {
    return libtorrent_jni.peer_connection_request_large_blocks__SWIG_0(swigCPtr, this);
  }

  public void request_large_blocks(boolean b) {
    libtorrent_jni.peer_connection_request_large_blocks__SWIG_1(swigCPtr, this, b);
  }

  public void set_endgame(boolean b) {
    libtorrent_jni.peer_connection_set_endgame(swigCPtr, this, b);
  }

  public boolean endgame() {
    return libtorrent_jni.peer_connection_endgame(swigCPtr, this);
  }

  public boolean no_download() {
    return libtorrent_jni.peer_connection_no_download__SWIG_0(swigCPtr, this);
  }

  public void no_download(boolean b) {
    libtorrent_jni.peer_connection_no_download__SWIG_1(swigCPtr, this, b);
  }

  public boolean ignore_stats() {
    return libtorrent_jni.peer_connection_ignore_stats__SWIG_0(swigCPtr, this);
  }

  public void ignore_stats(boolean b) {
    libtorrent_jni.peer_connection_ignore_stats__SWIG_1(swigCPtr, this, b);
  }

  public long peer_rank() {
    return libtorrent_jni.peer_connection_peer_rank(swigCPtr, this);
  }

  public void fast_reconnect(boolean r) {
    libtorrent_jni.peer_connection_fast_reconnect__SWIG_0(swigCPtr, this, r);
  }

  public boolean fast_reconnect() {
    return libtorrent_jni.peer_connection_fast_reconnect__SWIG_1(swigCPtr, this);
  }

  public void received_piece(int index) {
    libtorrent_jni.peer_connection_received_piece(swigCPtr, this, index);
  }

  public void announce_piece(int index) {
    libtorrent_jni.peer_connection_announce_piece(swigCPtr, this, index);
  }

  public void superseed_piece(int replace_piece, int new_piece) {
    libtorrent_jni.peer_connection_superseed_piece(swigCPtr, this, replace_piece, new_piece);
  }

  public boolean super_seeded_piece(int index) {
    return libtorrent_jni.peer_connection_super_seeded_piece(swigCPtr, this, index);
  }

  public boolean can_write() {
    return libtorrent_jni.peer_connection_can_write(swigCPtr, this);
  }

  public boolean is_seed() {
    return libtorrent_jni.peer_connection_is_seed(swigCPtr, this);
  }

  public int num_have_pieces() {
    return libtorrent_jni.peer_connection_num_have_pieces(swigCPtr, this);
  }

  public void set_share_mode(boolean m) {
    libtorrent_jni.peer_connection_set_share_mode(swigCPtr, this, m);
  }

  public boolean share_mode() {
    return libtorrent_jni.peer_connection_share_mode(swigCPtr, this);
  }

  public void set_upload_only(boolean u) {
    libtorrent_jni.peer_connection_set_upload_only(swigCPtr, this, u);
  }

  public boolean upload_only() {
    return libtorrent_jni.peer_connection_upload_only(swigCPtr, this);
  }

  public void set_holepunch_mode() {
    libtorrent_jni.peer_connection_set_holepunch_mode(swigCPtr, this);
  }

  public void keep_alive() {
    libtorrent_jni.peer_connection_keep_alive(swigCPtr, this);
  }

  public sha1_hash pid() {
    return new sha1_hash(libtorrent_jni.peer_connection_pid(swigCPtr, this), false);
  }

  public void set_pid(sha1_hash peer_id) {
    libtorrent_jni.peer_connection_set_pid(swigCPtr, this, sha1_hash.getCPtr(peer_id), peer_id);
  }

  public boolean has_piece(int i) {
    return libtorrent_jni.peer_connection_has_piece(swigCPtr, this, i);
  }

  public peer_request_vector upload_queue() {
    return new peer_request_vector(libtorrent_jni.peer_connection_upload_queue(swigCPtr, this), false);
  }

  public void clear_request_queue() {
    libtorrent_jni.peer_connection_clear_request_queue(swigCPtr, this);
  }

  public high_resolution_clock.duration download_queue_time(int extra_bytes) {
    return new high_resolution_clock.duration(libtorrent_jni.peer_connection_download_queue_time__SWIG_0(swigCPtr, this, extra_bytes), true);
  }

  public high_resolution_clock.duration download_queue_time() {
    return new high_resolution_clock.duration(libtorrent_jni.peer_connection_download_queue_time__SWIG_1(swigCPtr, this), true);
  }

  public boolean is_interesting() {
    return libtorrent_jni.peer_connection_is_interesting(swigCPtr, this);
  }

  public boolean is_choked() {
    return libtorrent_jni.peer_connection_is_choked(swigCPtr, this);
  }

  public boolean is_peer_interested() {
    return libtorrent_jni.peer_connection_is_peer_interested(swigCPtr, this);
  }

  public boolean has_peer_choked() {
    return libtorrent_jni.peer_connection_has_peer_choked(swigCPtr, this);
  }

  public void choke_this_peer() {
    libtorrent_jni.peer_connection_choke_this_peer(swigCPtr, this);
  }

  public void maybe_unchoke_this_peer() {
    libtorrent_jni.peer_connection_maybe_unchoke_this_peer(swigCPtr, this);
  }

  public void update_interest() {
    libtorrent_jni.peer_connection_update_interest(swigCPtr, this);
  }

  public void get_peer_info(peer_info p) {
    libtorrent_jni.peer_connection_get_peer_info(swigCPtr, this, peer_info.getCPtr(p), p);
  }

  public stat statistics() {
    return new stat(libtorrent_jni.peer_connection_statistics(swigCPtr, this), false);
  }

  public void add_stat(long downloaded, long uploaded) {
    libtorrent_jni.peer_connection_add_stat(swigCPtr, this, downloaded, uploaded);
  }

  public void sent_bytes(int bytes_payload, int bytes_protocol) {
    libtorrent_jni.peer_connection_sent_bytes(swigCPtr, this, bytes_payload, bytes_protocol);
  }

  public void received_bytes(int bytes_payload, int bytes_protocol) {
    libtorrent_jni.peer_connection_received_bytes(swigCPtr, this, bytes_payload, bytes_protocol);
  }

  public void trancieve_ip_packet(int bytes, boolean ipv6) {
    libtorrent_jni.peer_connection_trancieve_ip_packet(swigCPtr, this, bytes, ipv6);
  }

  public void sent_syn(boolean ipv6) {
    libtorrent_jni.peer_connection_sent_syn(swigCPtr, this, ipv6);
  }

  public void received_synack(boolean ipv6) {
    libtorrent_jni.peer_connection_received_synack(swigCPtr, this, ipv6);
  }

  public void second_tick(int tick_interval_ms) {
    libtorrent_jni.peer_connection_second_tick(swigCPtr, this, tick_interval_ms);
  }

  public tcp_endpoint remote() {
    return new tcp_endpoint(libtorrent_jni.peer_connection_remote(swigCPtr, this), false);
  }

  public tcp_endpoint local_endpoint() {
    return new tcp_endpoint(libtorrent_jni.peer_connection_local_endpoint(swigCPtr, this), true);
  }

  public bitfield get_bitfield() {
    return new bitfield(libtorrent_jni.peer_connection_get_bitfield(swigCPtr, this), false);
  }

  public int_vector allowed_fast() {
    return new int_vector(libtorrent_jni.peer_connection_allowed_fast(swigCPtr, this), false);
  }

  public int_vector suggested_pieces() {
    return new int_vector(libtorrent_jni.peer_connection_suggested_pieces(swigCPtr, this), false);
  }

  public high_resolution_clock.time_point connected_time() {
    return new high_resolution_clock.time_point(libtorrent_jni.peer_connection_connected_time(swigCPtr, this), true);
  }

  public high_resolution_clock.time_point last_received() {
    return new high_resolution_clock.time_point(libtorrent_jni.peer_connection_last_received(swigCPtr, this), true);
  }

  public void disconnect(error_code ec, operation_t op, int error) {
    libtorrent_jni.peer_connection_disconnect__SWIG_0(swigCPtr, this, error_code.getCPtr(ec), ec, op.swigValue(), error);
  }

  public void disconnect(error_code ec, operation_t op) {
    libtorrent_jni.peer_connection_disconnect__SWIG_1(swigCPtr, this, error_code.getCPtr(ec), ec, op.swigValue());
  }

  public void connect_failed(error_code e) {
    libtorrent_jni.peer_connection_connect_failed(swigCPtr, this, error_code.getCPtr(e), e);
  }

  public boolean is_disconnecting() {
    return libtorrent_jni.peer_connection_is_disconnecting(swigCPtr, this);
  }

  public void on_connection_complete(error_code e) {
    libtorrent_jni.peer_connection_on_connection_complete(swigCPtr, this, error_code.getCPtr(e), e);
  }

  public boolean is_connecting() {
    return libtorrent_jni.peer_connection_is_connecting(swigCPtr, this);
  }

  public void received_valid_data(int index) {
    libtorrent_jni.peer_connection_received_valid_data(swigCPtr, this, index);
  }

  public boolean received_invalid_data(int index, boolean single_peer) {
    return libtorrent_jni.peer_connection_received_invalid_data(swigCPtr, this, index, single_peer);
  }

  public boolean is_outgoing() {
    return libtorrent_jni.peer_connection_is_outgoing(swigCPtr, this);
  }

  public void received_listen_port() {
    libtorrent_jni.peer_connection_received_listen_port(swigCPtr, this);
  }

  public boolean on_local_network() {
    return libtorrent_jni.peer_connection_on_local_network(swigCPtr, this);
  }

  public boolean ignore_unchoke_slots() {
    return libtorrent_jni.peer_connection_ignore_unchoke_slots(swigCPtr, this);
  }

  public boolean failed() {
    return libtorrent_jni.peer_connection_failed(swigCPtr, this);
  }

  public int desired_queue_size() {
    return libtorrent_jni.peer_connection_desired_queue_size(swigCPtr, this);
  }

  public int download_payload_rate() {
    return libtorrent_jni.peer_connection_download_payload_rate(swigCPtr, this);
  }

  public void reset_choke_counters() {
    libtorrent_jni.peer_connection_reset_choke_counters(swigCPtr, this);
  }

  public boolean disconnect_if_redundant() {
    return libtorrent_jni.peer_connection_disconnect_if_redundant(swigCPtr, this);
  }

  public void increase_est_reciprocation_rate() {
    libtorrent_jni.peer_connection_increase_est_reciprocation_rate(swigCPtr, this);
  }

  public void decrease_est_reciprocation_rate() {
    libtorrent_jni.peer_connection_decrease_est_reciprocation_rate(swigCPtr, this);
  }

  public int est_reciprocation_rate() {
    return libtorrent_jni.peer_connection_est_reciprocation_rate(swigCPtr, this);
  }

  public void incoming_keepalive() {
    libtorrent_jni.peer_connection_incoming_keepalive(swigCPtr, this);
  }

  public void incoming_choke() {
    libtorrent_jni.peer_connection_incoming_choke(swigCPtr, this);
  }

  public void incoming_unchoke() {
    libtorrent_jni.peer_connection_incoming_unchoke(swigCPtr, this);
  }

  public void incoming_interested() {
    libtorrent_jni.peer_connection_incoming_interested(swigCPtr, this);
  }

  public void incoming_not_interested() {
    libtorrent_jni.peer_connection_incoming_not_interested(swigCPtr, this);
  }

  public void incoming_have(int piece_index) {
    libtorrent_jni.peer_connection_incoming_have(swigCPtr, this, piece_index);
  }

  public void incoming_dont_have(int piece_index) {
    libtorrent_jni.peer_connection_incoming_dont_have(swigCPtr, this, piece_index);
  }

  public void incoming_bitfield(bitfield bits) {
    libtorrent_jni.peer_connection_incoming_bitfield(swigCPtr, this, bitfield.getCPtr(bits), bits);
  }

  public void incoming_request(peer_request r) {
    libtorrent_jni.peer_connection_incoming_request(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public void incoming_piece_fragment(int bytes) {
    libtorrent_jni.peer_connection_incoming_piece_fragment(swigCPtr, this, bytes);
  }

  public void start_receive_piece(peer_request r) {
    libtorrent_jni.peer_connection_start_receive_piece(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public void incoming_cancel(peer_request r) {
    libtorrent_jni.peer_connection_incoming_cancel(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public boolean can_disconnect(error_code ec) {
    return libtorrent_jni.peer_connection_can_disconnect(swigCPtr, this, error_code.getCPtr(ec), ec);
  }

  public void incoming_dht_port(int listen_port) {
    libtorrent_jni.peer_connection_incoming_dht_port(swigCPtr, this, listen_port);
  }

  public void incoming_reject_request(peer_request r) {
    libtorrent_jni.peer_connection_incoming_reject_request(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public void incoming_have_all() {
    libtorrent_jni.peer_connection_incoming_have_all(swigCPtr, this);
  }

  public void incoming_have_none() {
    libtorrent_jni.peer_connection_incoming_have_none(swigCPtr, this);
  }

  public void incoming_allowed_fast(int index) {
    libtorrent_jni.peer_connection_incoming_allowed_fast(swigCPtr, this, index);
  }

  public void incoming_suggest(int index) {
    libtorrent_jni.peer_connection_incoming_suggest(swigCPtr, this, index);
  }

  public void set_has_metadata(boolean m) {
    libtorrent_jni.peer_connection_set_has_metadata(swigCPtr, this, m);
  }

  public boolean has_metadata() {
    return libtorrent_jni.peer_connection_has_metadata(swigCPtr, this);
  }

  public boolean send_choke() {
    return libtorrent_jni.peer_connection_send_choke(swigCPtr, this);
  }

  public boolean send_unchoke() {
    return libtorrent_jni.peer_connection_send_unchoke(swigCPtr, this);
  }

  public void send_interested() {
    libtorrent_jni.peer_connection_send_interested(swigCPtr, this);
  }

  public void send_not_interested() {
    libtorrent_jni.peer_connection_send_not_interested(swigCPtr, this);
  }

  public void send_suggest(int piece) {
    libtorrent_jni.peer_connection_send_suggest(swigCPtr, this, piece);
  }

  public void snub_peer() {
    libtorrent_jni.peer_connection_snub_peer(swigCPtr, this);
  }

  public void reject_piece(int index) {
    libtorrent_jni.peer_connection_reject_piece(swigCPtr, this, index);
  }

  public boolean can_request_time_critical() {
    return libtorrent_jni.peer_connection_can_request_time_critical(swigCPtr, this);
  }

  public void cancel_all_requests() {
    libtorrent_jni.peer_connection_cancel_all_requests(swigCPtr, this);
  }

  public void send_block_requests() {
    libtorrent_jni.peer_connection_send_block_requests(swigCPtr, this);
  }

  public void assign_bandwidth(int channel, int amount) {
    libtorrent_jni.peer_connection_assign_bandwidth(swigCPtr, this, channel, amount);
  }

  public boolean in_handshake() {
    return libtorrent_jni.peer_connection_in_handshake(swigCPtr, this);
  }

  public void setup_send() {
    libtorrent_jni.peer_connection_setup_send(swigCPtr, this);
  }

  public void cork_socket() {
    libtorrent_jni.peer_connection_cork_socket(swigCPtr, this);
  }

  public boolean is_corked() {
    return libtorrent_jni.peer_connection_is_corked(swigCPtr, this);
  }

  public void uncork_socket() {
    libtorrent_jni.peer_connection_uncork_socket(swigCPtr, this);
  }

  public void set_country(String c) {
    libtorrent_jni.peer_connection_set_country(swigCPtr, this, c);
  }

  public boolean has_country() {
    return libtorrent_jni.peer_connection_has_country(swigCPtr, this);
  }

  public int outstanding_bytes() {
    return libtorrent_jni.peer_connection_outstanding_bytes(swigCPtr, this);
  }

  public int send_buffer_size() {
    return libtorrent_jni.peer_connection_send_buffer_size(swigCPtr, this);
  }

  public int send_buffer_capacity() {
    return libtorrent_jni.peer_connection_send_buffer_capacity(swigCPtr, this);
  }

  public void max_out_request_queue(int s) {
    libtorrent_jni.peer_connection_max_out_request_queue__SWIG_0(swigCPtr, this, s);
  }

  public int max_out_request_queue() {
    return libtorrent_jni.peer_connection_max_out_request_queue__SWIG_1(swigCPtr, this);
  }

  public int last_seen_complete() {
    return libtorrent_jni.peer_connection_last_seen_complete(swigCPtr, this);
  }

  public void set_last_seen_complete(int ago) {
    libtorrent_jni.peer_connection_set_last_seen_complete(swigCPtr, this, ago);
  }

  public long uploaded_in_last_round() {
    return libtorrent_jni.peer_connection_uploaded_in_last_round(swigCPtr, this);
  }

  public long downloaded_in_last_round() {
    return libtorrent_jni.peer_connection_downloaded_in_last_round(swigCPtr, this);
  }

  public long uploaded_since_unchoked() {
    return libtorrent_jni.peer_connection_uploaded_since_unchoked(swigCPtr, this);
  }

  public high_resolution_clock.time_point time_of_last_unchoke() {
    return new high_resolution_clock.time_point(libtorrent_jni.peer_connection_time_of_last_unchoke(swigCPtr, this), true);
  }

  public void on_disk() {
    libtorrent_jni.peer_connection_on_disk(swigCPtr, this);
  }

  public void on_allocate_disk_buffer(String buffer, int buffer_size) {
    libtorrent_jni.peer_connection_on_allocate_disk_buffer(swigCPtr, this, buffer, buffer_size);
  }

  public int num_reading_bytes() {
    return libtorrent_jni.peer_connection_num_reading_bytes(swigCPtr, this);
  }

  public void setup_receive() {
    libtorrent_jni.peer_connection_setup_receive(swigCPtr, this);
  }

  public counters stats_counters() {
    return new counters(libtorrent_jni.peer_connection_stats_counters(swigCPtr, this), false);
  }

  public int get_priority(int channel) {
    return libtorrent_jni.peer_connection_get_priority(swigCPtr, this, channel);
  }

  public enum connection_type {
    bittorrent_connection(libtorrent_jni.peer_connection_bittorrent_connection_get()),
    url_seed_connection(libtorrent_jni.peer_connection_url_seed_connection_get()),
    http_seed_connection(libtorrent_jni.peer_connection_http_seed_connection_get());

    public final int swigValue() {
      return swigValue;
    }

    public static connection_type swigToEnum(int swigValue) {
      connection_type[] swigValues = connection_type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (connection_type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + connection_type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private connection_type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private connection_type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private connection_type(connection_type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum channels {
    upload_channel,
    download_channel,
    num_channels;

    public final int swigValue() {
      return swigValue;
    }

    public static channels swigToEnum(int swigValue) {
      channels[] swigValues = channels.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (channels swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + channels.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private channels() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private channels(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private channels(channels swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum flags_t {
    req_time_critical(libtorrent_jni.peer_connection_req_time_critical_get()),
    req_busy(libtorrent_jni.peer_connection_req_busy_get());

    public final int swigValue() {
      return swigValue;
    }

    public static flags_t swigToEnum(int swigValue) {
      flags_t[] swigValues = flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private flags_t(flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum message_type_flags {
    message_type_request(libtorrent_jni.peer_connection_message_type_request_get());

    public final int swigValue() {
      return swigValue;
    }

    public static message_type_flags swigToEnum(int swigValue) {
      message_type_flags[] swigValues = message_type_flags.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (message_type_flags swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + message_type_flags.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private message_type_flags() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private message_type_flags(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private message_type_flags(message_type_flags swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum sync_t {
    read_async,
    read_sync;

    public final int swigValue() {
      return swigValue;
    }

    public static sync_t swigToEnum(int swigValue) {
      sync_t[] swigValues = sync_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (sync_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + sync_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private sync_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private sync_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private sync_t(sync_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
