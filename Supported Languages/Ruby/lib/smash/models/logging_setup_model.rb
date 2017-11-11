# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # LoggingSetupModel Model.
  class LoggingSetupModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :key

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :name

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :origin

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :activate

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['name'] = 'name'
        @_hash['origin'] = 'origin'
        @_hash['activate'] = 'activate'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   name = nil,
                   origin = nil,
                   activate = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @name = name
      @origin = origin
      @activate = activate

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
      name = hash['name']
      origin = hash['origin']
      activate = hash['activate']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      LoggingSetupModel.new(key,
                            uid,
                            name,
                            origin,
                            activate,
                            hash)
    end
  end
end
