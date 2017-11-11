# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # EncryptionModel Model.
  class EncryptionModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :key

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :data

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :file

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :method

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :bit

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['data'] = 'data'
        @_hash['file'] = 'file'
        @_hash['method'] = 'method'
        @_hash['bit'] = 'bit'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   data = nil,
                   file = nil,
                   method = nil,
                   bit = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @data = data
      @file = file
      @method = method
      @bit = bit

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      key = hash['key']
      uid = hash['uid']
      data = hash['data']
      file = hash['file']
      method = hash['method']
      bit = hash['bit']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      EncryptionModel.new(key,
                          uid,
                          data,
                          file,
                          method,
                          bit,
                          hash)
    end
  end
end
