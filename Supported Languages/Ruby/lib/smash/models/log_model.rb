# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # LogModel Model.
  class LogModel < BaseModel
    # TODO: Write general description for this method
    # @return [MMDDYYYYHHMMSSModel]
    attr_accessor :mmddyyyyhhmmssx

    # TODO: Write general description for this method
    # @return [MMDDYYYYHHMMSSModel]
    attr_accessor :mmddyyyyhhmmssy

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['mmddyyyyhhmmssx'] = 'MMDDYYYYHHMMSSX'
        @_hash['mmddyyyyhhmmssy'] = 'MMDDYYYYHHMMSSY'
      end
      @_hash
    end

    def initialize(mmddyyyyhhmmssx = nil,
                   mmddyyyyhhmmssy = nil,
                   additional_properties = {})
      @mmddyyyyhhmmssx = mmddyyyyhhmmssx
      @mmddyyyyhhmmssy = mmddyyyyhhmmssy

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      mmddyyyyhhmmssx = MMDDYYYYHHMMSSModel.from_hash(hash['MMDDYYYYHHMMSSX']) if
        hash['MMDDYYYYHHMMSSX']
      mmddyyyyhhmmssy = MMDDYYYYHHMMSSModel.from_hash(hash['MMDDYYYYHHMMSSY']) if
        hash['MMDDYYYYHHMMSSY']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      LogModel.new(mmddyyyyhhmmssx,
                   mmddyyyyhhmmssy,
                   hash)
    end
  end
end
