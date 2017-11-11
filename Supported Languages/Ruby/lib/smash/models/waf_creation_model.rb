# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # WAFCreationModel Model.
  class WAFCreationModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :key

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :origin

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :cname

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['origin'] = 'origin'
        @_hash['cname'] = 'cname'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   origin = nil,
                   cname = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @origin = origin
      @cname = cname

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
      origin = hash['origin']
      cname = hash['cname']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      WAFCreationModel.new(key,
                           uid,
                           origin,
                           cname,
                           hash)
    end
  end
end
