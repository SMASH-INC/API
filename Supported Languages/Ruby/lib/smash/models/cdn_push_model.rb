# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # CDNPushModel Model.
  class CDNPushModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :key

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :cname

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :file

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['cname'] = 'cname'
        @_hash['file'] = 'file'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   cname = nil,
                   file = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @cname = cname
      @file = file

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
      cname = hash['cname']
      file = hash['file']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      CDNPushModel.new(key,
                       uid,
                       cname,
                       file,
                       hash)
    end
  end
end
